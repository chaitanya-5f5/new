var express = require('express');
let mongodb=require('mongodb');
let mongodbClient=mongodb.MongoClient;


let getemployees=express.Router().get("/",(req,res)=>
{
    mongodbClient.connect("mongodb://localhost:27017/crud",(err,db)=>
    {
         if(err)
         {
            throw err;
         } else {
            db.collection('employee').find({}).toArray((err,employees)=>{
                if(err){
                    throw err;
                }
                else{
                    if(employees.length>0)
                    {
                        res.send(employees);
                    }
                    else{
                        res.send({"Message":"No Record(s) Found"});
                    }
                }
         });
            db.close();
        
    }
  });

});

module.exports=getemployees;