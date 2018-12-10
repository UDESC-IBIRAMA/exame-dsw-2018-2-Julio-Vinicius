import React,{Component} from 'react';

class Modulo_academico extends Component {

    render(){
        return (<div className="academico">
                <form className="formulario">
                    <input className='matricula' type={text}/>
                    <input className='nome' type={text}/>
                </form>
                </div>);
    };

}
export default Modulo_academico;