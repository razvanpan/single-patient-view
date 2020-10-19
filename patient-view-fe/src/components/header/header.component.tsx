import React from 'react';
import './header.component.css'
import {PatientBannerComponent} from 'patient-banner'
import 'patient-banner/dist/index.css'


const HeaderContainer = () => (
  <div className={'header'}>
   <PatientBannerComponent></PatientBannerComponent>
  </div>
);

export default HeaderContainer;