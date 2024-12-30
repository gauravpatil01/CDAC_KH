using Donation_Database.Models;
using Donation_Database.Services;
using Microsoft.AspNetCore.Mvc;

namespace Donation_Database.Controllers
{
    public class DonationController : Controller
    {


        private IDoantionService doantionService;

        public DonationController(IDoantionService doantionService)
        {
            this.doantionService = doantionService;
        }

        public IActionResult Index()
        {
            return View();
        }

        //we can create the add and update view itself in the IDE of vs code but 
        //for showw details we have to create and customize the cshtml page as per our requeement 


        //its an getmethod to render the view on the browser
        public IActionResult AddDonation()
        {
            return View();
        }

        //its an post method to add the donation to the database

        [HttpPost]
        public IActionResult AddDonation(Donation donation)
        {

            doantionService.AddDonation(donation);
            return RedirectToAction("GetAllDonation");
        }

        public IActionResult UpdateDonation(int id)
        {
            Donation donation = doantionService.GetDonationById(id);
            if(donation== null)
            {
                return NotFound();
            }
            return View(donation);
        }
        [HttpPost]
        public IActionResult UpdateDonation(Donation donation)
        {
            doantionService.UpdateDonation(donation);
            return RedirectToAction("GetAllDonation");
        }

        [HttpPost]
        public IActionResult DeleteDonation(int id)
        {

            doantionService.DeleteDonation(id);
            return RedirectToAction("GetAllDonation");
        }

        public IActionResult GetAllDonation()
        {
            var donations= doantionService.GetAllDonation();
            return View(donations);
        }
    }
}
