import React from 'react';
import './body.component.css'

import PhysicalExamination from '../physical-examination/physical-examination.component'


const BodyContainer = () => (
  <div> <div className={'card-area'}>
    <PhysicalExamination/>
    </div>
    <div className={'work-panel'}>
    Work-panel
  </div>
  </div>
 
);

export default BodyContainer;