# applozic
REST API where an actor can submit the data containing the list of movies with movie name, start date and end date and the API will return the total amount that he can make along with the final list of movies to select.

# Steps to run :
Clone the project in any ide. Run it as spring boot application. Using any API tool do a post request on below endpoint with the below json structure. The default port is 8080.

# End Point Is -
/movies

# Input Json example-
{
	"movieList": [{
			"movieName": "Bala",
			"startDate": "08-01-2020",
			"endDate": "28-01-2020"
		},
		{
			"movieName": "Rock",
			"startDate": "20-01-2020",
			"endDate": "30-01-2020"
		},
		{
			"movieName": "PolicyMaker",
			"startDate": "29-01-2020",
			"endDate": "16-02-2020"
		},
		{
			"movieName": "Brave",
			"startDate": "02-02-2020",
			"endDate": "14-02-2020"
		},
		{
			"movieName": "Drive",
			"startDate": "10-02-2020",
			"endDate": "18-02-2020"
		},
		{
			"movieName": "Race",
			"startDate": "15-02-2020",
			"endDate": "28-02-2020"
		}
	]
}
