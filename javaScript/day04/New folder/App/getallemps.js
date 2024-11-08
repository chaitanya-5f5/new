var express = require('express');
var dataFile = require("../data/data.json");

let getallemployees = express.Router().get("/", (req, res) => {
    res.send(dataFile); 
});

module.exports = getallemployees