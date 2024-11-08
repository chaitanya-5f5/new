var express = require('express');
var app = express();

var dataFile = require('../data/data.json');

app.get("/", function (req, res) {

    var employeeList = '';

    dataFile.employees.forEach(function (emp) {
        employeeList += `
        <li>
            <h3> ${emp.id} </h3>
            <h3> ${emp.name} </h3>
            <h3> ${emp.salary} </h3>
        </li>
        `;
    });

    res.send(employeeList);
});

app.server = app.listen(3000, function() {
    console.log('Server Started @PortNo: 3000');
});