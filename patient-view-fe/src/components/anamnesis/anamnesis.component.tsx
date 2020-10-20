import React from 'react'

import {Anamnesis} from 'anamnesis'
import 'anamnesis/dist/index.css'
import styles from './anamnesis.module.css'

const AnamnesisComponent = () =>(
    <div className={styles.anamnesis}>
        <Anamnesis></Anamnesis>
    </div>
    
)

export default AnamnesisComponent