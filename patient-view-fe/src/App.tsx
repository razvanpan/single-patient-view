import React from 'react';
import './App.css';
import HeaderContainer from "./components/header/header.component"
import BodyContainer from "./components/body/body.component"

function App() {
  return (
    <div className="App">
    <HeaderContainer></HeaderContainer>
    <BodyContainer></BodyContainer>
    </div>
      );
}

export default App;
