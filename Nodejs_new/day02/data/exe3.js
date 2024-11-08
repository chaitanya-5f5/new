var http = require('http');

var myServer = http.createServer(function (req, res) {

    res.writeHead(200, {'Content-Type': 'text/html'});
    
    res.write("<h3>Connection Success <br/>Welcome to NodeJS Server</h3>");
    res.end();
});

myServer.listen(3000);
console.log("Server Started @localhost:3000");