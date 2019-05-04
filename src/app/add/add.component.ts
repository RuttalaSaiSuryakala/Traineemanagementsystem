import { Component, OnInit } from '@angular/core';

class Trainee {
  traineeId: number;
traineeName:string;
  traineeLocation: string;
  traineeDomain:string
  constructor(traineeId: number,
  traineeName:string,
    traineeLocation: string,traineeDomain:string) {
    this.traineeDomain = traineeDomain;
    this.traineeLocation = traineeLocation;
    this.traineeId = traineeId;
    this.traineeName=traineeName
  }
}

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  trainees: Array<Trainee> = [];
  constructor() { }

  ngOnInit() {
  }
  add(value:any){
    this.trainees.push(new Trainee(value.traineeId,value.traineeName,value.traineeLocation,value.traineeDomain))
  console.log(this.trainees)
  }
}
