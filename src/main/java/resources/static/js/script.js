document.addEventListener('DOMContentLoaded', function() {

    const voteButtons = document.querySelectorAll('.vote-btn');
    voteButtons.forEach(button => {
        button.addEventListener('click', function(event) {
            const pollId = this.dataset.pollid;
            const optionId = this.dataset.optionid;

            fetch(`/vote/${pollId}`, {
                method: 'POST',
                body: JSON.stringify({ optionId: optionId }),
                headers: {
                    'Content-Type': 'application/json',
                }
            })
                .then(response => response.json())
                .then(data => {

                    if (data.success) {
                        alert('Vote successfully recorded!');

                    } else {
                        alert('Error: ' + data.message);
                    }
                })
                .catch(error => {
                    console.error('Error:', error);
                });
        });
    });

});
