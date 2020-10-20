import React from "react";
import { PainAssessment } from "pain-assessment";
import "pain-assessment/dist/index.css";

import styles from "./pain-assessment.module.css";

const PainAssessmentComponent = () => (
  <div className={styles.painAssessment}>
    <PainAssessment></PainAssessment>
  </div>
);

export default PainAssessmentComponent;
