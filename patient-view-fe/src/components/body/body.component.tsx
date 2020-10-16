import React from 'react';
import './body.component.css'

import {Anamnesis} from 'anamnesis'
import 'anamnesis/dist/index.css'

const BodyContainer = () => (
  <div className={'body-container'}> <div className={'card-area'}>
    <Anamnesis></Anamnesis>
    
    Card panel
    </div>
    <div className={'work-panel'}>
    Work-panel
  </div>
  </div>
 
);

export default BodyContainer;