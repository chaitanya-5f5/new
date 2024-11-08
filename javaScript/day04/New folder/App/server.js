var express = require('express');
var app = express();
app.use("/home",       require('./home'));
app.use("/getallemps", require('./getallemps'));
app.listen(3000);
console.log("Server Started @PortNo: 3000");