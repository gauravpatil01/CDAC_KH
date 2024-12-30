using System.Collections;
using Donation_Database.Models;

namespace Donation_Database.Repositories
{
    public interface IDonationRepository
    {

        public IEnumerable GetAllDonation();

        public void AddDonation(Donation donation);

        public void UpdateDonation(Donation donation);

        public void DeleteDonation(int donationId);

        public Donation GetDonationById(int donationId);
    }
}
