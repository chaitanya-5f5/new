var http = require('http');

var myServer = http.createServer(function (req, res) {
   res.write("Connection Established Successfully!!! \nWelcome to NodeJS Server"); 
   res.end();
});

myServer.listen(3000);

console.log("Server Started - Use URL: http://localhost:3000");