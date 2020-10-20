import React from "react";

import VitalSign from "vital-signs-spv";
import "vital-signs-spv/dist/index.css";
import "./vital-signs.component.css";

const VitalSignComponent = () => (
  <div className={"vital-signs"}>
    <VitalSign />
  </div>
);
export default VitalSignComponent;
