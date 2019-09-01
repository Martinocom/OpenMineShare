# OpenMineShare
Share your Minecraft server over several PCs. For friends use only!

## Users
Under construction.

## Developers
### Javadocs
Javadocs for the lastest stable release are available [here](https://leospyke96.github.io/OpenMineShare-javadoc).

### Importing the project
We suggest to import the project in [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/release/2019-06/r/eclipse-ide-java-developers).

#### Eclipse IDE configuration
Simply install the **Spotbugs Eclipse plugin** and the **Checkstyle plugin** from the Eclipse Marketplace.
<br/><br/>
Next, install **PMD**  by clicking on **Help --> Install new software**, then copy and paste ```https://dl.bintray.com/pmd/pmd-eclipse-plugin/updates/``` to the **Work with** field and type Enter.
<br/><br/>
Configuration files are already included in this repository, you should't need to do anything else but simply cloning and importing the project.

### Contributions
Contributions to this project are welcome. Just some rules:

 - If you write new features, please do so in a separate ```feature-``` branch.
 - We recommend forking the project, developing your stuff, then contributing back via pull request directly from GitHub
 - Commit often. Do not throw pull requests with a single giant commit adding or changing the whole world. Split it in multiple commits and request a merge to the mainline often.
 - Stay in sync with the develop branch: pull often from develop, so that you don't diverge too much from the main development line.
 - Do not introduce low quality code. All the new code must comply with the PMD, SpotBugs and Checkstyle rules (that are quite strict) and must not introduce any other warning. Resolutions of existing warnings (if any is present) are very welcome instead.
 
 ### License
 This software is released under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).
