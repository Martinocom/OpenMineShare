package it.oms.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.IOUtils;

/**
 * Provides basic functions for a DNS update tool.
 */
public final class ZipManager {

    // TODO: observable zip percentage
    private static int percentage = 0;
    private static final Object LOCK = new Object();

    private static class ZipManagerHolder {
        private static final ZipManager SINGLETON = new ZipManager(); // NOPMD
    }

    private ZipManager() {
    };

    /**
     * @return a instance of the singleton
     */
    public static ZipManager get() {
        return ZipManagerHolder.SINGLETON;
    }

    /**
     * Zip a file or a folder recursively.
     * 
     * @param sourceDir  the file or directory to be zipped
     * @param outputFile the .zip destination file
     * @throws IOException           if an exception occurs when creating the
     *                               archive
     * @throws FileNotFoundException if an exception occurs while retrieving the
     *                               files to zip
     */
    public void basicZip(final String sourceDir, final String outputFile) throws IOException, FileNotFoundException {
        synchronized (LOCK) {
            try (ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream(outputFile))) {
                compressDirectoryToZipfile(sourceDir, sourceDir, zipFile);
            }
        }
    }

    private void compressDirectoryToZipfile(final String rootDir, final String sourceDir, final ZipOutputStream out)
            throws IOException, FileNotFoundException {
        final File file = new File(sourceDir);
        final File[] files = file.listFiles();

        if (files != null) {
            for (File tmp : files) {
                if (tmp.isDirectory()) {
                    compressDirectoryToZipfile(rootDir, sourceDir + File.separator + tmp.getName(), out);
                } else {
                    ZipEntry entry = new ZipEntry(sourceDir.replace(rootDir, "") + tmp.getName());
                    out.putNextEntry(entry);

                    try (FileInputStream in = new FileInputStream(sourceDir + File.separator + tmp.getName())) {
                        IOUtils.copy(in, out);
                    }
                }

            }
        }

    }
}
