#!/usr/bin/env node
// console.log()

// const fs = require('node:fs');

// function ourReadFile() {
//     try {
//         const data = fs.readFileSync('test.txt', 'utf-8');
//         console.log(data)
//     }
//     catch (error) {

//     }
// }

// function ourReadFileAsync(){
//     console.log("first")
//     fs.readFile('test.txt', 'utf-8', (error, data) => {
//         console.log(data);
//     })
//     console.log("second")
// }


// // ourReadFile();
// ourReadFileAsync();

// function asyncy(){

//     console.log("start")

//     setTimeout(() => {
//        console.log("inside the setTimeout") 
//     }, 1000);

//     for (let i =0; i<100000000; i++){

//     }

//     console.log("end")
// }

// asyncy()

// function mockPromiseCall(waitTime, returnValue = "Hello!", shouldReject=false){
//     return new Promise((resolve, reject) =>{
//         setTimeout(() => {
//            if(shouldReject) {
//             reject(returnValue);
//            }else{
//             resolve(returnValue)
//            }
//         }, waitTime);
//     })
// }

// mockPromiseCall(5000, "Hello!").then((result) =>console.log(result))

const fs = require("node:fs");

const contents = fs.promises.readFile("test.txt", "utf-8")
console.log(contents)

console.log("print after readfile")