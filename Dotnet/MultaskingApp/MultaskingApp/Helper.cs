using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//TPL: Task Parallel Library : Parallesim  (concurrency)

namespace MultaskingApp
{
    static  class Helper
    {
        public static  async Task PerformLongRunningTask()
        {
            Console.WriteLine("Task Execution is started....");
            Console.WriteLine("Performing  Certain Task");
             await Task.Delay(10000);
            Console.WriteLine("Task Execuction is Finsihed");
        }
    }
}
