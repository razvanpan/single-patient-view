import React from 'react';
import './App.css';
import HeaderContainer from "./components/header/header.component"
import CardArea from "./components/body/card-area/card-area.component"
import WorkPanel from './components/body/work-panel/work-panel.component'

function App() {
  return (
    <div className="App">
    <HeaderContainer></HeaderContainer>
    <CardArea></CardArea>
    <WorkPanel></WorkPanel>
    </div>
      );
}

export default App;
