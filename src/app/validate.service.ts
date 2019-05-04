import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

export class Trainee {
  userName: string
  email: string
  traineeId: string
  traineeName: string
  password: string
  constructor(userName: string, email: string, traineeId: string, traineeName: string
    , password: string) {
    this.userName = userName
    this.email = email
    this.traineeId = traineeId
    this.traineeName = traineeName
    this.password = password
  }
}

@Injectable({
  providedIn: 'root'
})
export class ValidateService {

  userName: string ="admin"
  password: string ="admin"
  trainees: Array<Trainee> = [];

  constructor(private router: Router) { }

  login(value: Trainee) {

    console.log(value.userName)
    console.log(value.password)
    if (value.userName === this.userName && value.password === this.password) {
      alert("ok")
      this.router.navigate(['/menu'])
    }
    else {
      alert("Wrong Credentials")
      this.router.navigate(['/login'])
    }
  }
}

