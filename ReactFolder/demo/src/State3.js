import React, { useState } from 'react';

export default function State2() {
  const [value, setValue] = useState(0);
  const [bgColor, setBgColor] = useState('#ffffff'); // Default background color
  const [boxSize, setBoxSize] = useState({ width: 2000, height: 1000 }); // Initial width and height of the box

  const increment = () => {
    setValue(value + 1);
  };

  const decrement = () => {
    setValue(value - 1);
  };

  const changeColor = () => {
    const randomColor = '#' + Math.floor(Math.random() * 16777215).toString(16); // Generate a random hex color
    setBgColor(randomColor);
  };

 
  
  return (
    <div style={{ 
      backgroundColor: bgColor, 
      width: boxSize.width, 
      height: boxSize.height, 
      padding: '20px', 
      textAlign: 'center' 
    }}>
      <h1>{value}</h1>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={changeColor}>Next Color</button> {/* Button to change color */}
      
    </div>
  );
}