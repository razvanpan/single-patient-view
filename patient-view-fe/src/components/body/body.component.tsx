import React from "react";
import "./body.component.css";
import ChiefComplaint from "chief-complaint-lung-alexandru";
import "chief-complaint-lung-alexandru/dist/index.css";

import AnamnesisComponent from "../anamnesis/anamnesis.component";

const BodyContainer = () => (
  <div>
    <div className={"body-container"}></div>
    <div className={"card-area"}>
      Card-area
      <div className={"chief-complaint"}>
        <ChiefComplaint></ChiefComplaint>
      </div>
      <div>
        <AnamnesisComponent></AnamnesisComponent>
      </div>
    </div>
    <div className={"work-panel"}>Work-panel</div>
  </div>
);

export default BodyContainer;
