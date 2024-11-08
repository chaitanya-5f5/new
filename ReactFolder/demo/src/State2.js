import React, { useState } from 'react'

export default function State2() {
    const [value,setValue]=useState(0)
    const increment =()=>{
        setValue(value+1);
    }
    const decrement =()=>{
        setValue(value-1);
    }
  return (
    <div>
        <h1>{value}</h1>
      <button onClick={increment}>increment</button>
      <button onClick={decrement}>decrement</button>
    </div>
  )
}
