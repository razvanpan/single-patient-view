import React from 'react';
import PhysicalExaminationComponent from 'com.training.physical-examination'
import 'com.training.physical-examination/dist/index.css'
import styles from './physical-examination.module.css'


const PhysicalExamination = () => (
    <div className={styles.physicalExamination}> 
        <PhysicalExaminationComponent/>
    </div>
   
  );
 
export default PhysicalExamination;