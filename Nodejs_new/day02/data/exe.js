var http = require('http');

var myServer = http.createServer(function (req, res) {
    res.write("<h1>Connection Success <br/>Welcome to NodeJS Server</h1>");
    res.end();
});

myServer.listen(3000);
console.log("Server Started @localhost:3000");