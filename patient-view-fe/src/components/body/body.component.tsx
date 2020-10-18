import React from 'react';
import './body.component.css'

import AnamnesisComponent from '../anamnesis/anamnesis.component';

const BodyContainer = () => (
  <div className={'body-container'}>
     <div className={'card-area'}>
       <AnamnesisComponent></AnamnesisComponent>
    </div>
    <div className={'work-panel'}>
    Work-panel
  </div>
  </div>
 
);

export default BodyContainer;