using System.Collections;
using Donation_Database.Models;
using Donation_Database.Services;
using MySql.Data.MySqlClient;

namespace Donation_Database.Repositories
{
    public class DonationRepository : IDonationRepository
    {

        private readonly string connectionString;


        public DonationRepository(string connectionString)
        {
            this.connectionString = connectionString;
        }

        public void AddDonation(Donation donation)
        {
            using (var connection = new MySqlConnection(connectionString))
            {
                try
                {
                    var command = new MySqlCommand("INSERT INTO  Donations (DonationId, DonorName, Amount, Date , Purpose) VALUES (@DonationId, @DonorName, @Amount, @Date , @Purpose)", connection);
                    command.Parameters.AddWithValue("@DonationId", donation.DonationId);
                    command.Parameters.AddWithValue("@DonorName", donation.DonorName);
                    command.Parameters.AddWithValue("@Amount", donation.Amount);
                    command.Parameters.AddWithValue("@Date", donation.Date);
                    command.Parameters.AddWithValue("@Purpose", donation.Purpose);
                    connection.Open();
                    command.ExecuteNonQuery();//insert update delete 
                    //command.ExecuteScalar(); // count max min sum aggarete 

                }
                catch (MySqlException ex)
                {
                    throw ex;
                }
                finally
                {
                    connection.Close();

                }
            }    
        }

        public void DeleteDonation(int donationId)
        {
            using (var connection = new MySqlConnection(connectionString))
            {
                try
                {
                    var command = new MySqlCommand("Delete from Donations where DonationId=@DonationId", connection);
                    command.Parameters.AddWithValue("@DonationId",donationId);
                    connection.Open();
                    command.ExecuteNonQuery();//insert update delete 
                    //command.ExecuteScalar(); // count max min sum aggarete 

                }
                catch (MySqlException ex)
                {
                    throw ex;
                }
                finally
                {
                    connection.Close();

                }
            }
        }

        public IEnumerable GetAllDonation()
        {
            List<Donation> donations = new List<Donation>();
            using (var connection = new MySqlConnection(connectionString))
            {
                try
                {
                    var query = "select * from Donations";
                    using (var command = new MySqlCommand(query, connection))
                    {
                        connection.Open();
                        var reader = command.ExecuteReader(); //select statement
                        while (reader.Read())
                        {
                            Donation donation = new Donation();
                            donation.DonationId= reader.GetInt32("DonationId");
                            donation.DonorName = reader.GetString("DonorName");
                            donation.Amount = reader.GetDouble("Amount");
                            donation.Date = reader.GetString("Date");
                            donation.Purpose= reader.GetString("Purpose");
                            donations.Add(donation);
                        }

                    }
                }
                catch (MySqlException ex)
                {
                    throw ex;
                }
                finally
                {
                    connection.Close();

                }
            }
            return donations;
        }

        public Donation GetDonationById(int donationId)
        {
            Donation donation = new Donation();
            using (var connection = new MySqlConnection(connectionString))
            {
                try
                {
                    var query = "select * from Donations where DonationId=@DoantionId";

                    using (var command = new MySqlCommand(query, connection))
                    {
                        command.Parameters.AddWithValue("@DoantionId", donationId);
                        connection.Open();

                        var reader = command.ExecuteReader(); //select statement
                        while (reader.Read())
                        {
                            
                            donation.DonationId = reader.GetInt32("DonationId");
                            donation.DonorName = reader.GetString("DonorName");
                            donation.Amount = reader.GetDouble("Amount");
                            donation.Date = reader.GetString("Date");
                            donation.Purpose = reader.GetString("Purpose");
                           
                        }

                    }
                }
                catch (MySqlException ex)
                {
                    throw ex;
                }
                finally
                {
                    connection.Close();

                }
            }
            return donation;
        }

        public void UpdateDonation(Donation donation)
        {
            using (var connection = new MySqlConnection(connectionString))
            {
                try
                {
                    var command = new MySqlCommand("Update Donations set DonorName=@DonorName, Amount=@Amount, Date=@Date, Purpose=@Purpose where DonationId=@DonationId", connection);
                    
                    command.Parameters.AddWithValue("@DonorName", donation.DonorName);
                    command.Parameters.AddWithValue("@Amount", donation.Amount);
                    command.Parameters.AddWithValue("@Date", donation.Date);
                    command.Parameters.AddWithValue("@Purpose", donation.Purpose);
                    command.Parameters.AddWithValue("@DonationId", donation.DonationId);
                    connection.Open();
                    command.ExecuteNonQuery();//insert update delete 
                    //command.ExecuteScalar(); // count max min sum aggarete 

                }
                catch (MySqlException ex)
                {
                    throw ex;
                }
                finally
                {
                    connection.Close();

                }
            }

        }
    }
}
