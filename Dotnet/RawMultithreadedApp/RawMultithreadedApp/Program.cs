using RawMultithreadedApp;


int mainThreadId=Thread.CurrentThread.ManagedThreadId;
Console.WriteLine(mainThreadId);

Console.WriteLine("**** Main Program exeuction started......");


ThreadStart assistant=new ThreadStart(Helper.PerformLongRunningTask);

Thread secondaryThread = new Thread(assistant);
secondaryThread.Start();

//Helper.PerformLongRunningTask();

mainThreadId = Thread.CurrentThread.ManagedThreadId;
Console.WriteLine(mainThreadId);

secondaryThread.Join();

Console.WriteLine(" **** Main Program exeuction is about to finish...");