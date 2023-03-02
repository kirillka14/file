using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Metadata.Ecma335;
using System.Text;
using System.Threading.Tasks;

namespace EFCodeFirst.Models
{
    internal class Blog
    {
        public string NameBLog { get; set; }
        public Author Author { get; set; }
        public DateTime DateCreate { get; set; }

    }
}
