document.addEventListener('DOMContentLoaded', () => {
    const contactForm = document.querySelector('.contact-form');
    if (contactForm) {
        contactForm.addEventListener('submit', (e) => {
            e.preventDefault();
            alert('Mensagem enviada com sucesso! Em breve entraremos em contato.');
            contactForm.reset();
        });
    }
});
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @PostMapping("/contato")
    public String handleContactForm(@RequestBody ContactMessage message) {
        System.out.println("Mensagem recebida de: " + message.getEmail());
        System.out.println("Nome: " + message.getName());
        System.out.println("Conteúdo: " + message.getMessage());
        
        // Lógica para enviar o email ou salvar no banco de dados
        return "Mensagem enviada com sucesso!";
    }
    document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('contact-form-js');
    const statusMessage = document.getElementById('status-message');
    const formUrl = 'https://formspree.io/f/xjkeqrgj';

    if (form) {
        form.addEventListener('submit', async function(e) {
            e.preventDefault(); // Impede o envio padrão do formulário

            const data = new FormData(e.target);
            
            try {
                const response = await fetch(formUrl, {
                    method: 'POST',
                    body: data,
                    headers: {
                        'Accept': 'application/json'
                    }
                });

                if (response.ok) {
                    statusMessage.textContent = 'Mensagem enviada com sucesso!';
                    statusMessage.style.color = 'green';
                    form.reset(); // Limpa o formulário
                } else {
                    statusMessage.textContent = 'Houve um erro. Tente novamente.';
                    statusMessage.style.color = 'red';
                }
            } catch (error) {
                statusMessage.textContent = 'Não foi possível conectar. Verifique sua internet.';
                statusMessage.style.color = 'red';
            }
        });
    }
});
}