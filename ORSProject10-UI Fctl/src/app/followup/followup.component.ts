import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-followup',
  templateUrl: './followup.component.html',
  styleUrls: ['./followup.component.css']
})
export class FollowupComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
    super(locator.endpoints.FOLLOWUP, locator, route);
  }

  submit() {
    var _self = this;
    console.log('in submit');
    console.log(this.form);
    console.log(this.form.data);
    this.serviceLocator.httpService.post(this.api.save, this.form.data, function (res) {
      _self.form.message = '';
      _self.form.data.id = res.result.data;

      if (res.success) {
        _self.form.message = "Data is saved";
        _self.form.data.id = res.result.data;

        console.log(_self.form.data.id);
        console.log("----------Rahul----------.");

      } else {
        _self.form.error = true;
        if (res.result.inputerror) {
          _self.form.inputerror = res.result.inputerror;
        }
        _self.form.message = res.result.message;
      }
      _self.form.data.id = res.result.data;
      console.log('FORM', _self.form);
    });
  }

  submit1() {
    var _self = this;
    console.log(this.form + "submit running start");
    console.log(this.form.data + "form data going to be submit");
    this.serviceLocator.httpService.post(this.api.search, this.form.data, function (res) {
      _self.form.message = '';
      _self.form.inputerror = {};
      _self.form.data.id = res.result.data;

      if (res.success) {
        _self.form.message = "Data is saved";
        _self.form.data.id = res.result.data;

        console.log(_self.form.data.id);
        console.log("--------------------.");

      } else {
        _self.form.error = true;
        _self.form.inputerror = res.result.inputerror;
        _self.form.message = res.result.message;
      }
      _self.form.data.id = res.result.data;
      console.log('FORM', _self.form);
    });
  }


  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }



  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.patient);
    console.log(form.patient);
    flag = flag && validator.isNotNullObject(form.doctor);
    console.log(form.doctor);
    flag = flag && validator.isNotNullObject(form.visitdate);
    console.log(form.visitdate);
    flag = flag && validator.isNotNullObject(form.fees);
    console.log(form.fees);
    

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.patient = data.patient;
    console.log('populate form in followupcomponent' + data.id);
    form.doctor = data.doctor;
    form.visitdate = data.visitdate;

    console.log(form.visitdate + 'mhkkkkkkkk')
    form.fees = data.fees;
   
  }
  parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
    }
    return null;
  }
  test() {

  }

}

