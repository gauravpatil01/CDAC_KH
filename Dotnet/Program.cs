//Entry Point Function:  Main
using OnlineShoppingPortal.Repositories;
using OnlineShoppingPortal.Services.Implementation;
using OnlineShoppingPortal.Services.Interfaces;

var builder = WebApplication.CreateBuilder(args);

//Sever side configuration
// Add services to the container.
//IOC container:
//Setting up the dependency injection container

builder.Services.AddControllersWithViews();
//builder.Services.AddSingleton<IProductService, ProductService>();
//builder.Services.AddTransient<IProductService, ProductService>();
//builder.Services.AddScoped<IDataRepository, JsonDataRespository>();
//builder.Services.AddScoped<IDataRepository, DatabaseRepository>();
builder.Services.AddScoped<IDataRepository, DataRepositoryDisconnected>();
builder.Services.AddScoped<IProductService, ProductService>();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

//Middleware Configuration
//Setting up the request processing pipeline

app.UseHttpsRedirection();
app.UseRouting();
app.UseAuthorization();
app.MapStaticAssets();

//Routing Configuration
//Setting up the routing table
//Routing is the process of mapping an incoming HTTP request to a controller action
app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}")
    .WithStaticAssets();
app.Run();