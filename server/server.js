// Server variables
var WebSocket = require('ws');
var fileSystem = require('fs');

const MESSAGE_TYPES = {
    /*
    permissionRequest: "permission-request",
    permissionRespond: "permission-respond",
    newJoin: "new-join",
    adminStartRequest: "admin-start-request",
    adminStartRespond: "admin-start-respond",
    userDisconnected: "user-disconnected",
    playerBoardReady: "player-board-ready",
    startGame: "start-game",
    board: "board",
    shoot: "shoot",
    nextTurn: "next-turn",
    win: "win",
    again: "again",
    wrongMessage: "wrong-mesage"*/
}


// Variables for launching
var settings = {
    isRead: false,
}
var socket = null;

// Variables when launched
var currentOpenedServer = null;


/* -------------------------------------------------------------------------------------------------- */

writeLogo();

console.log("Reading the config file...");
fileSystem.readFile('server.properties', 'utf8', onReadCompleted);

function onReadCompleted(readError, contents) {
    // If there are no errors when reading
    if (readError == null) {
        try {
            // Try to split values (remove also \r on Windows, if any)
            contents = contents.replace(/(\r)/gm, "");
            contents.split("\n").forEach(function(element) {
                // Save only not-null values stored in settings
                if (element != "" && element != null && element != undefined) {                  
                    settings[element.split("=")[0]] = parseElement(element.split("=")[1]);
                }
            });

            // Settings are ready and ok!
            settings.isRead = true;

        } catch(splitError) {
            // Some values are incorrect, error!
            console.log("Failed to read the file! Error: " + splitEerror); 
            settings.isRead = false;
        }

        // If settings is correctly read
        if (settings.isRead) {
            console.log("OK!");
            console.log("Starting up the server on port " + settings.port + "...");
            socket = setupConnection();

            // If all goes ok, it's open!
            if (socket != null) {
                writeOpening();

                // Now begin to listening!
                socket.on('connection', onNewRequest);
            }
        }

    } else {
        console.log("Failed to read the file! Error: " + readError); 
    }
}

function setupConnection() {
    var tempWebSocket = new WebSocket.Server({ port: settings.port });

    if (tempWebSocket == null) {
        console.log("Failed to open the server on port " + settings.port);
    }
    else {
        console.log("OK!");
    }
    
    return tempWebSocket;
}

function writeLogo() {
    console.log("╔═════════════════════════════════════╗");
    console.log("║   Welcome to OpenMineShare Server   ║");
    console.log("╚═════════════════════════════════════╝");
    console.log("");
}

function writeOpening() {
    console.log("");
    console.log("The server is now open on port " + settings.port + ". Clients can connect and ask if someone has the Minecraft Server active.");
}

function onNewRequest(client, request) {
    log("Received connection from a new client: " + request.connection.remoteAddress);
                
    client.on('message', (msg) => {
        const receivedMessage = JSON.parse(msg);

        switch (receivedMessage.type) {}
    });
}

function log(message) {
    if (settings.logAll)
        console.log(message);
}

function parseElement(element) {
    // Boolean?
    if (element == "true") {
        return true;
    }
    if (element == "false") {
        return false;
    }

    // Numeric?
    if (parseFloat(element) != NaN) {
        return parseFloat(element);
    }

    // Fucking string
    return element;
}


