import React from "react";
import "./body.component.css";
import PhysicalExamination from "../physical-examination/physical-examination.component";
import AnamnesisComponent from "../anamnesis/anamnesis.component";
import PainAssessmentComponent from "../pain-assessment/pain-assessment";
import ChiefComplaintComponent from "../chief-complaint/chief-complaint.component";
const BodyContainer = () => (
  <div className={"body-container"}>
    <div className={"card-area"}>
      <PainAssessmentComponent></PainAssessmentComponent>
      <ChiefComplaintComponent></ChiefComplaintComponent>
      <PhysicalExamination />
      <AnamnesisComponent></AnamnesisComponent>
    </div>
    <div className={"work-panel"}>Work-panel</div>
  </div>
);

export default BodyContainer;
