import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
    super(locator.endpoints.CLIENT, locator, route);
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
    flag = flag && validator.isNotNullObject(form.priorityId);
    console.log(form.priorityId);
    flag = flag && validator.isNotNullObject(form.name);
    console.log(form.productName);
    flag = flag && validator.isNotNullObject(form.address);
    console.log(form.address);
    flag = flag && validator.isNotNullObject(form.phone);
    console.log(form.phone);


    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    console.log(form.id + 'populate form in shoppingcomponent');
    form.clientName = data.clientName;
    form.clientAddress = data.clientAddress;
    form.clientPhone = data.clientPhone;
    form.priorityId = data.priorityId;
    form.priorityName = data.priorityName;

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