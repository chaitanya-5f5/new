var express = require('express');
var app = express();

app.get("/", function (req, res) {
    res.send("<h3>Connection Success!!!</h3> URL: " + req.url);
});

app.server = app.listen(3000, function () {
    console.log('Server is Started @Port Number: 3000');
});