using System.ComponentModel.DataAnnotations;

namespace Donation_Database.Models
{
    public class Donation
    {

        public int DonationId { get; set; }

        [Required]
        public string DonorName { get; set; }

        [Required]
        [Range(100, 1000000)]
        public double Amount { get; set; }

        [Required]
        public string Date { get; set; }

        [Required]
        public string Purpose { get; set; }

        public Donation() { }


        //constructor called in getalldonation etnries... to get all donations
        public Donation(int donationId, string donorName, double amount, string date, string purpose)
        {
            DonationId = donationId;
            DonorName = donorName;
            Amount = amount;
            Date = date;
            Purpose = purpose;
        }

        //constructor called in  adddoantion method ... to add new donation
        //we not getting donation id from user as it is auto incremented in database
        public Donation(string donorName, double amount, string date, string purpose)
        {
            DonorName = donorName;
            Amount = amount;
            Date = date;
            Purpose = purpose;
        }



    }
}
