//var json = document.getElementById("weightTrend").textContent;
//var obj = JSON.parse(json);
//
//console.log("column headers.length : " + obj.columnHeaders.length);
//console.log("getting row element: " + obj.rows[1][0]);
//
//var date = [];
//var weight = [];
//
//for(i = 0; i < obj.columnHeaders.length; i++) {
//	
//	var name = obj.columnHeaders[i].name;
//	
//	if(name === "date") {
//		console.log(createDataArray(obj, i));
//		thirtyDayTotals = createDataArray(obj, i);
//		
//	} else if(name === "weight") {
//		console.log(createDataArray(obj, i));
//		views = createDataArray(obj, i);
//		
//	}
//}






var ctx = document.getElementById('weight_chart').getContext('2d');
var myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ['2020-01-27','2020-01-28','2020-01-29','2020-01-30','2020-01-31'],
        datasets: [{
            label: 'Weight Over Time',
            data: [25, 30, 35, 35, 40],
            backgroundColor: [
                'rgba(100, 100, 250, 0)',
            ],
            borderColor: [
            	'rgba(120, 194, 173, 1.0)',
            ],
            borderWidth: 2
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true,
                    precision:0
                }
            }],
            xAxes: [{
        	    ticks: {
        	        autoSkip: true,
        	        maxTicksLimit: 20
        	    }
        	}]
        },
        elements: {
            line: {
                tension: 0
            }
        },
        responsive: true,
        maintainAspectRatio: false
    }
});