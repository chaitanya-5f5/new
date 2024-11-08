var express = require('express');
var app = express();

 
app.use("/getallemployees", require('./getallemp'));


app.listen(3000);
console.log("Server Started @PortNo: 3000");