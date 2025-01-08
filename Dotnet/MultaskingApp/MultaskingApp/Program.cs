


using MultaskingApp;

using System.Net.Http;


public class Program
{
    public   static async Task Main(string[] args)
    {
        int count = 56;
        count++;

         await  Helper.PerformLongRunningTask();

        string fullName = "Sachin Tendular : God of Cricket";
        Console.WriteLine(fullName);


        HttpClient client = new HttpClient();
        string apiUrl = "http://localhost:8989/api/products";
        var  response= await client.GetAsync(apiUrl);
        Console.WriteLine(response);
    }
}
