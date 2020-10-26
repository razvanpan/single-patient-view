import React from "react";
import "./body.component.css";
import PhysicalExamination from "../physical-examination/physical-examination.component";
import AnamnesisComponent from "../anamnesis/anamnesis.component";
import PainAssessmentComponent from "../pain-assessment/pain-assessment";
import ChiefComplaintComponent from "../chief-complaint/chief-complaint.component";
import VitalSignComponent from "../vital-signs/vital-signs.component";
import TriageComponent from "../triage/triage.component";
const BodyContainer = () => (
  <div className={"body-container"}>
    <div className={"card-area"}>
      <ChiefComplaintComponent />
      <VitalSignComponent />
      <AnamnesisComponent />

      <PainAssessmentComponent />
      <PhysicalExamination />
    </div>
    <div className={"work-panel"}>
      <TriageComponent />
    </div>
  </div>
);

export default BodyContainer;
