
      const button = document.querySelector('button');
      
      function changeText() {
        const p = document.querySelector('p');
        p.textContent = "Changed because of an event handler property.";
        const button= document.querySelector('button');
        button.textContent = "I was clicked";
      }
      
      function goToLookup(){
        window.location.href = '/lookup.html'
      }

