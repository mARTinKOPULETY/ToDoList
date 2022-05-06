import React from 'react';
import './App.css';
import NavBar from'./components/NavBar';
//hash resi problem s  kompatibilitou
import {HashRouter as Router, Routes} from 'react-router-dom';


function App() {
  return (
// <> </>brano jako jeden  element
    <> 
  
        <Router>
          <NavBar />
            <Routes>

              
            </Routes>
            
            
        
        
        
        </Router>

    </>
  );
}

export default App;
