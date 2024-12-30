using System.Collections;
using Donation_Database.Models;
using Donation_Database.Repositories;

namespace Donation_Database.Services
{
    public class DonationService : IDoantionService
    {
        private IDonationRepository donationRepository; 

        public DonationService(IDonationRepository donationRepository)
        {
            this.donationRepository = donationRepository;
        }

        public void AddDonation(Donation donation)
        {
            donationRepository.AddDonation(donation);
        }

        public void DeleteDonation(int donationId)
        {
            donationRepository.DeleteDonation(donationId);
        }

        public IEnumerable GetAllDonation()
        {
           return  donationRepository.GetAllDonation();
        }

        public Donation GetDonationById(int donationId)
        {
           return donationRepository.GetDonationById(donationId);
        }

        public void UpdateDonation(Donation donation)
        {
            donationRepository.UpdateDonation(donation);
        }
    }
}
