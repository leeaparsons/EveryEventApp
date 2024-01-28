$(document).ready(() => {

    function populateTable(data) {
        const tableBody = $('#table-body');
                tableBody.empty();
                data.forEach(item => {
                    const row = `
                    <tr>
                        <td>${item.name}</td>
                        <td>${item.location}</td>
                        <td>${item.country}</td>
                        <td>${item.continent}</td>
                        <td>${item.distance}</td>
                        <td>${item.date}</td>
                        <td>${item.swim}</td>
                        <td>${item.bike}</td>
                        <td>${item.run}</td>
                        <td>${item.avg_temp_c}</td>
                        <td>${item.company}</td>
                    </tr>`;
                    tableBody.append(row);
                });
            }

        $.ajax({ // ajax to fetch data
            method: 'GET',
            url: '/data',
            dataType: 'json',
            success: function(data){
                populateTable(data); // populate table with retrieved data
                },
                error: function (xhr, status, error){
                    console.error('Error', error); // log errors to console
                }
        });
    });