document.addEventListener('DOMContentLoaded', function() {

    // Event listener for a vote button
    const voteButtons = document.querySelectorAll('.vote-btn');
    voteButtons.forEach(button => {
        button.addEventListener('click', function(event) {
            const pollId = this.dataset.pollid;
            const optionId = this.dataset.optionid;

            // Perform an AJAX request to vote
            fetch(`/vote/${pollId}`, {
                method: 'POST',
                body: JSON.stringify({ optionId: optionId }),
                headers: {
                    'Content-Type': 'application/json',
                    // Include any necessary headers, like CSRF tokens
                }
            })
                .then(response => response.json())
                .then(data => {
                    // Handle the response data
                    if (data.success) {
                        alert('Vote successfully recorded!');
                        // Update the UI to reflect the new vote
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
