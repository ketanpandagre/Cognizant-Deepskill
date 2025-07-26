import { Component } from 'react';
import '../stylesheet/calculatescore.css'

class CalculateScore extends Component{
    percentToDecimal=(decimal)=>{
        return decimal.toFixed(2)+'%';
    }
    calcScore=(total,goal)=>{
        return this.percentToDecimal(total/goal);
    }
    render(){
        const {name,school,total,goal}=this.props;
        return(
            <div className='formatStyle'>
                <h1><font color="brown">Student Details</font></h1>

                <div className='Name'>
                    <b><span>Name : </span></b>
                    <span>{name}</span>
                </div>

                <div className='School'>
                    <b><span>School : </span></b>
                    <span>{school}</span>
                </div>

                <div className='Total'>
                    <b><span>Total : </span></b>
                    <span>{total}</span>
                    <span> Marks</span>
                </div>

                <div className='Score'>
                    <b><span>Score : </span></b>
                    <span>{this.calcScore(total,goal)}</span>
                </div>
            </div>    
        );
    }
}
export default CalculateScore;