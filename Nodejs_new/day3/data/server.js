var express = require('express');
var bodyParser = require('body-parser');
var app = express();

app.use(bodyParser.json());

app.use("/home",       require('./home'));
app.use("/getallemps", require('./getallemps'));
app.use("/getempbyid", require('./getempbyid'));
app.use("/addemp",     require('./registeremp'));

app.listen(3000);
console.log("Server Started @PortNo: 3000");