
import './App.css';
import './State.js';
import State4 from './State4.js';
import { BrowserRouter as Router ,Routes,Route} from 'react-router-dom';
function App() {
  return (
    <Router>   
       <div className="App">
     <State4 />
      <Routes>
        <Route path='/' element={<h1>HELLO</h1>}/>
        <Route path='/State5' element={<State5 />} />
          <Route path='/State3' element={<State3 />} />

     </Routes>
    </div>
    </Router>

  );
}

export default App;
