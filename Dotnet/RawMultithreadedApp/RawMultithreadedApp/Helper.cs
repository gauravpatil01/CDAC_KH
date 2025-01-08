using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RawMultithreadedApp
{
    public  class Helper
    {
        public static void PerformLongRunningTask()
        {

            int threadId=Thread.CurrentThread.ManagedThreadId;
            Console.WriteLine(" Thread Id= " + threadId);
            Console.WriteLine("Long running Task exeuction is started....");



            Thread.Sleep(10000);
            Console.WriteLine(" Thread Id= " + threadId);
            Console.WriteLine("Long running Task exeution is getting Finished");
        }
    }
}
