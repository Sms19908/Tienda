
// Para separar los números por comas
function separateNumber(numero, local) { 
//    output = numero.toLocaleString(local); 
//    document.querySelector('.output').textContent = output; 
//     givenNumber = 123456789; 
      
//    number = new Intl.NumberFormat(local,{ style: 'decimal' }); 
//    separado = number.format(numero); 
//    document.querySelector('.output').textContent = separado; 
    
    $('#separado').html(new Intl.NumberFormat(local).format(numero));
    //https://es.stackoverflow.com/questions/23179/como-hacer-que-mi-input-text-tenga-separador-de-miles-y-decimales-en-jquery
    
} 


